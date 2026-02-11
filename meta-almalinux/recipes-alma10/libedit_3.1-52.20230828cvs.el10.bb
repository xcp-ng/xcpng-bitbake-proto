
PN = "libedit"
PE = "0"
PV = "3.1"
PR = "52.20230828cvs.el10"
PACKAGES = "libedit libedit-devel"


URI_libedit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libedit-3.1-52.20230828cvs.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libedit = " \
 glibc \
 ncurses-libs \
"

URI_libedit-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libedit-devel-3.1-52.20230828cvs.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libedit-devel = " \
 ncurses-devel \
 pkgconf-pkg-config \
 libedit \
"
