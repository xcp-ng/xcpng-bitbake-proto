
inherit dnf-bridge

PN = "xfsdump"
PE = "0"
PV = "3.2.0"
PR = "1.el10"
PACKAGES = "xfsdump"


URI_xfsdump = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/xfsdump-3.2.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xfsdump = " \
 libuuid \
 attr \
 libattr \
 libgcc \
 ncurses-libs \
 glibc \
 xfsprogs \
"
