
PN = "oddjob"
PE = "0"
PV = "0.34.7"
PR = "14.el10"
PACKAGES = "oddjob oddjob-mkhomedir"


URI_oddjob = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/oddjob-0.34.7-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oddjob = "
 systemd
 libxml2
 bash
 dbus
 glibc
 libselinux
 psmisc
 dbus-libs
"

URI_oddjob-mkhomedir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/oddjob-mkhomedir-0.34.7-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oddjob-mkhomedir = "
 glibc
 oddjob
 grep
 pam-libs
 libselinux
 bash
 sed
 dbus-tools
 psmisc
 dbus-libs
"
