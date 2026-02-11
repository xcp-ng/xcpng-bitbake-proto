
PN = "usermode"
PE = "0"
PV = "1.114"
PR = "12.el10"
PACKAGES = "usermode"


URI_usermode = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/usermode-1.114-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usermode = "
 libuser
 shadow-utils
 util-linux
 pam
 pam-libs
 glib2
 glibc
 libselinux
"
