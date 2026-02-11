
PN = "oddjob"
PE = "0"
PV = "0.34.7"
PR = "14.el10"
PACKAGES = "oddjob oddjob-mkhomedir"


URI_oddjob = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/oddjob-0.34.7-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oddjob = "/bin/sh ( ) systemd-units ( ) systemd-sysv ( ) psmisc ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) dbus ( ) libxml2.so.2(LIBXML2_2.5.8)(64bit) ( )"
RPROVIDES:oddjob = "oddjob ( =  0.34.7-14.el10) config(oddjob) ( =  0.34.7-14.el10) oddjob(x86-64) ( =  0.34.7-14.el10)"

URI_oddjob-mkhomedir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/oddjob-mkhomedir-0.34.7-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oddjob-mkhomedir = "/bin/sh ( ) grep ( ) sed ( ) psmisc ( ) /usr/bin/dbus-send ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) oddjob ( =  0.34.7-14.el10)"
RPROVIDES:oddjob-mkhomedir = "config(oddjob-mkhomedir) ( =  0.34.7-14.el10) oddjob-mkhomedir ( =  0.34.7-14.el10) oddjob-mkhomedir(x86-64) ( =  0.34.7-14.el10)"
