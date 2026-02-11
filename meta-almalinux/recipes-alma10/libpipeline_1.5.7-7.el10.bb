
PN = "libpipeline"
PE = "0"
PV = "1.5.7"
PR = "7.el10"
PACKAGES = "libpipeline libpipeline-devel"


URI_libpipeline = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpipeline-1.5.7-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpipeline = " \
 glibc \
"

URI_libpipeline-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpipeline-devel-1.5.7-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpipeline-devel = " \
 libpipeline \
 pkgconf-pkg-config \
"
