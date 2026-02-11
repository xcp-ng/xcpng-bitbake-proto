
inherit dnf-bridge

PN = "xz"
PE = "1"
PV = "5.6.2"
PR = "4.el10_0"
PACKAGES = "xz xz-libs xz-devel xz-lzma-compat xz-static"


URI_xz = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/xz-5.6.2-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xz = " \
 glibc \
 bash \
 grep \
 xz-libs \
"

URI_xz-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/xz-libs-5.6.2-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xz-libs = " \
 glibc \
"

URI_xz-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xz-devel-5.6.2-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xz-devel = " \
 pkgconf-pkg-config \
 xz-libs \
"

URI_xz-lzma-compat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xz-lzma-compat-5.6.2-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xz-lzma-compat = " \
 glibc \
 xz \
 xz-libs \
"

URI_xz-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xz-static-5.6.2-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xz-static = ""
