
inherit dnf-bridge

PN = "ncurses"
PE = "0"
PV = "6.4"
PR = "14.20240127.el10"
PACKAGES = "ncurses ncurses-base ncurses-libs ncurses-c++-libs ncurses-devel ncurses-term ncurses-static"


URI_ncurses = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ncurses-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses = " \
 glibc \
 ncurses-libs \
"

URI_ncurses-base = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ncurses-base-6.4-14.20240127.el10.noarch.rpm;unpack=0"
RDEPENDS:ncurses-base = ""

URI_ncurses-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ncurses-libs-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses-libs = " \
 glibc \
 ncurses-base \
"

URI_ncurses-c++-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ncurses-c++-libs-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses-c++-libs = " \
 glibc \
 libgcc \
 ncurses-libs \
 libstdc++ \
"

URI_ncurses-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ncurses-devel-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses-devel = " \
 ncurses-devel \
 pkgconf-pkg-config \
 ncurses-libs \
 bash \
 ncurses-c++-libs \
"

URI_ncurses-term = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ncurses-term-6.4-14.20240127.el10.noarch.rpm;unpack=0"
RDEPENDS:ncurses-term = " \
 ncurses-base \
"

URI_ncurses-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ncurses-static-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses-static = " \
 ncurses-devel \
"
