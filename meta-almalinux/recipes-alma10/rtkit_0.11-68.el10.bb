
PN = "rtkit"
PE = "0"
PV = "0.11"
PR = "68.el10"
PACKAGES = "rtkit"


URI_rtkit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rtkit-0.11-68.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rtkit = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) dbus ( ) polkit ( ) libcap.so.2()(64bit) ( )"
RPROVIDES:rtkit = "group(rtkit) ( ) config(rtkit) ( =  0.11-68.el10) rtkit ( =  0.11-68.el10) rtkit(x86-64) ( =  0.11-68.el10) user(rtkit) ( =  dSBydGtpdCAxNzIgIlJlYWx0aW1lS2l0IiAvIC9zYmluL25vbG9naW4A)"
