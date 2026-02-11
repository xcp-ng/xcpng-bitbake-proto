
PN = "HdrHistogram_c"
PE = "0"
PV = "0.11.8"
PR = "7.el10"
PACKAGES = "HdrHistogram_c HdrHistogram_c-devel"


URI_HdrHistogram_c = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/HdrHistogram_c-0.11.8-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:HdrHistogram_c = "
 glibc
 zlib-ng-compat
"

URI_HdrHistogram_c-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/HdrHistogram_c-devel-0.11.8-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:HdrHistogram_c-devel = "
 zlib-ng-compat-devel
 HdrHistogram_c
 cmake-filesystem
 pkgconf-pkg-config
"
