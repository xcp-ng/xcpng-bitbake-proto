
PN = "policycoreutils"
PE = "0"
PV = "3.8"
PR = "1.el10"
PACKAGES = "policycoreutils policycoreutils-newrole policycoreutils-restorecond policycoreutils-dbus policycoreutils-devel policycoreutils-gui policycoreutils-python-utils policycoreutils-sandbox python3-policycoreutils"


URI_policycoreutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/policycoreutils-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) coreutils ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) /usr/bin/bash ( ) util-linux ( ) libaudit.so.1()(64bit) ( ) grep ( ) sed ( ) gawk ( ) rpm ( ) diffutils ( ) libsemanage.so.2()(64bit) ( ) libsepol.so.2()(64bit) ( ) libsepol.so.2(LIBSEPOL_1.0)(64bit) ( ) libsemanage.so.2(LIBSEMANAGE_1.0)(64bit) ( ) libsepol.so.2(LIBSEPOL_1.1)(64bit) ( ) libselinux.so.1(LIBSELINUX_3.4)(64bit) ( ) libsemanage.so.2(LIBSEMANAGE_1.1)(64bit) ( ) libsemanage.so.2(LIBSEMANAGE_3.4)(64bit) ( ) libselinux-utils ( >=  3.8-1) libsepol ( >=  3.8-1)"
RPROVIDES:policycoreutils = "/sbin/fixfiles ( ) /sbin/restorecon ( ) policycoreutils ( =  3.8-1.el10) config(policycoreutils) ( =  3.8-1.el10) policycoreutils(x86-64) ( =  3.8-1.el10)"

URI_policycoreutils-newrole = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/policycoreutils-newrole-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils-newrole = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libaudit.so.1()(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libpam_misc.so.0()(64bit) ( ) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) ( ) policycoreutils ( =  3.8-1.el10)"
RPROVIDES:policycoreutils-newrole = "config(policycoreutils-newrole) ( =  3.8-1.el10) policycoreutils-newrole ( =  3.8-1.el10) policycoreutils-newrole(x86-64) ( =  3.8-1.el10)"

URI_policycoreutils-restorecond = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/policycoreutils-restorecond-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils-restorecond = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libselinux.so.1()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libgio-2.0.so.0()(64bit) ( )"
RPROVIDES:policycoreutils-restorecond = "config(policycoreutils-restorecond) ( =  3.8-1.el10) policycoreutils-restorecond ( =  3.8-1.el10) policycoreutils-restorecond(x86-64) ( =  3.8-1.el10)"

URI_policycoreutils-dbus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-dbus-3.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:policycoreutils-dbus = "/usr/bin/python3 ( ) python3-gobject-base ( ) polkit ( ) python3-policycoreutils ( =  3.8-1.el10)"
RPROVIDES:policycoreutils-dbus = "policycoreutils-dbus ( =  3.8-1.el10)"

URI_policycoreutils-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-devel-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/python3 ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) python3-dnf ( ) /usr/bin/make ( ) policycoreutils-python-utils ( =  3.8-1.el10) selinux-policy-devel ( if  selinux-policy)"
RPROVIDES:policycoreutils-devel = "policycoreutils-devel ( =  3.8-1.el10) policycoreutils-devel(x86-64) ( =  3.8-1.el10)"

URI_policycoreutils-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-gui-3.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:policycoreutils-gui = "/usr/bin/sh ( ) /usr/bin/python3 ( ) python3-gobject ( ) gtk3 ( ) python(abi) ( =  3.12) python3-policycoreutils ( =  3.8-1.el10) policycoreutils-dbus ( =  3.8-1.el10) policycoreutils-devel ( =  3.8-1.el10)"
RPROVIDES:policycoreutils-gui = "application() ( ) application(selinux-polgengui.desktop) ( ) application(sepolicy.desktop) ( ) application(system-config-selinux.desktop) ( ) policycoreutils-gui ( =  3.8-1.el10)"

URI_policycoreutils-python-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-python-utils-3.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:policycoreutils-python-utils = "/usr/bin/python3 ( ) python3-policycoreutils ( =  3.8-1.el10)"
RPROVIDES:policycoreutils-python-utils = "policycoreutils-python-utils ( =  3.8-1.el10)"

URI_policycoreutils-sandbox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/policycoreutils-sandbox-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:policycoreutils-sandbox = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) rsync ( ) python3-policycoreutils ( =  3.8-1.el10)"
RPROVIDES:policycoreutils-sandbox = "config(policycoreutils-sandbox) ( =  3.8-1.el10) policycoreutils-sandbox ( =  3.8-1.el10) policycoreutils-sandbox(x86-64) ( =  3.8-1.el10)"

URI_python3-policycoreutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-policycoreutils-3.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-policycoreutils = "python3-libselinux ( ) python3-distro ( ) checkpolicy ( ) python(abi) ( =  3.12) policycoreutils ( =  3.8-1.el10) audit-libs-python3 ( >=  3.0) python3-libsemanage ( >=  3.8-1) python3-setools ( >=  4.4.0)"
RPROVIDES:python3-policycoreutils = "python3-policycoreutils ( =  3.8-1.el10) policycoreutils-python3 ( =  3.8-1.el10) python-policycoreutils ( =  3.8-1.el10) python3.12-policycoreutils ( =  3.8-1.el10) python3.12dist(sepolicy) ( =  3.8) python3dist(sepolicy) ( =  3.8)"
