
PN = "libarchive"
PE = "0"
PV = "3.7.7"
PR = "4.el10_0"
PACKAGES = "libarchive bsdtar libarchive-devel bsdcat bsdcpio bsdunzip"


URI_libarchive = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libarchive-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libarchive = " \
 libacl \
 zlib-ng-compat \
 bzip2-libs \
 lz4-libs \
 openssl-libs \
 libxml2 \
 libzstd \
 glibc \
 xz-libs \
"

URI_bsdtar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bsdtar-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:bsdtar = " \
 glibc \
 libarchive \
"

URI_libarchive-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libarchive-devel-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libarchive-devel = " \
 openssl-devel \
 pkgconf-pkg-config \
 libarchive \
"

URI_bsdcat = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bsdcat-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:bsdcat = " \
 glibc \
 libarchive \
"

URI_bsdcpio = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bsdcpio-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:bsdcpio = " \
 glibc \
 libarchive \
"

URI_bsdunzip = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bsdunzip-3.7.7-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:bsdunzip = " \
 glibc \
 libarchive \
"
