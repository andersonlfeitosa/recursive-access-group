package com.andersonlfeitosa.group;

import java.util.HashMap;
import java.util.Map;

public class PermissionManager {

  private Map<String, Group> all = null;

  private User joe = null;

  public PermissionManager() {
    this.all = createPermissionTree();
    this.joe = createJoe();
  }

  public boolean joeHasPermission(String groupName) {
    Group group = this.all.get(groupName);

    if (this.joe.getGroups().contains(group)) {
      return true;
    } else {
      if (group == null || group.getParent() == null) {
        return false;
      } else {
        return joeHasPermission(group.getParent().getName());
      }
    }
  }

  private User createJoe() {
    User user = new User("joe");
    user.addGroup(new Group("group-0020"));

    return user;
  }

  private Map<String, Group> createPermissionTree() {
    Group group0001 = new Group("group-0001");

    Group group0020 = new Group("group-0020");
    Group group0021 = new Group("group-0021");
    Group group0022 = new Group("group-0022");
    Group group0023 = new Group("group-0023");
    Group group00231 = new Group("group-00231");

    Group group0030 = new Group("group-0030");
    Group group0031 = new Group("group-0031");

    Group group0040 = new Group("group-0040");

    // group-0001
    group0001.addSubGroup(group0020);
    group0001.addSubGroup(group0030);
    group0001.addSubGroup(group0040);

    // group-0020
    group0020.addSubGroup(group0021);
    group0020.addSubGroup(group0022);
    group0020.addSubGroup(group0023);
    group0020.setParent(group0001);

    // group-0021
    group0021.setParent(group0020);

    // group-0022
    group0022.setParent(group0020);

    // group-0023
    group0023.addSubGroup(group00231);
    group0023.setParent(group0020);

    // group-00231
    group00231.setParent(group0023);

    // group-0030
    group0030.addSubGroup(group0031);
    group0030.setParent(group0001);

    // group-0031
    group0031.setParent(group0030);

    // group-0040
    group0040.setParent(group0001);

    Map<String, Group> groups = new HashMap<>();
    groups.put(group0001.getName(), group0001);
    groups.put(group0020.getName(), group0020);
    groups.put(group0021.getName(), group0021);
    groups.put(group0022.getName(), group0022);
    groups.put(group0023.getName(), group0023);
    groups.put(group00231.getName(), group00231);
    groups.put(group0030.getName(), group0030);
    groups.put(group0031.getName(), group0031);
    groups.put(group0040.getName(), group0040);

    return groups;
  }

}
