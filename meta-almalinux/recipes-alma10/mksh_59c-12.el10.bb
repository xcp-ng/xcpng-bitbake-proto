
PN = "mksh"
PE = "0"
PV = "59c"
PR = "12.el10"
PACKAGES = "mksh"


URI_mksh = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mksh-59c-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mksh = " \
 grep \
 bash \
 glibc \
 alternatives \
 sed \
"
