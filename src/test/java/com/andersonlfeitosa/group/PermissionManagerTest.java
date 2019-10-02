package com.andersonlfeitosa.group;

import org.junit.Test;

public class PermissionManagerTest {

    private PermissionManager permissionManager = new PermissionManager();

    @Test
    public void test() {
        System.out.println(permissionManager.joeHasPermission("group-0001"));
        System.out.println(permissionManager.joeHasPermission("group-0020"));
        System.out.println(permissionManager.joeHasPermission("group-0021"));
        System.out.println(permissionManager.joeHasPermission("group-0022"));
        System.out.println(permissionManager.joeHasPermission("group-0023"));
        System.out.println(permissionManager.joeHasPermission("group-00231"));
        System.out.println(permissionManager.joeHasPermission("group-0030"));
        System.out.println(permissionManager.joeHasPermission("group-0031"));
        System.out.println(permissionManager.joeHasPermission("group-0040"));
    }

}
