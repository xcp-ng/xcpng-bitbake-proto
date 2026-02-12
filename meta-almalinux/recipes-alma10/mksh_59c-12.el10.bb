
inherit dnf-bridge

PN = "mksh"
PE = "0"
PV = "59c"
PR = "12.el10"
PACKAGES = "mksh"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/mksh-59c-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mksh = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mksh-59c-12.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mksh}"
RDEPENDS:mksh = " \
 grep \
 bash \
 glibc \
 alternatives \
 sed \
"
