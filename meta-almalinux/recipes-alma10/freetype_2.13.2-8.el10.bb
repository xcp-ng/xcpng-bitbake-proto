
inherit dnf-bridge

PN = "freetype"
PE = "0"
PV = "2.13.2"
PR = "8.el10"
PACKAGES = "freetype freetype-devel freetype-demos"


URI_freetype = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/freetype-2.13.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freetype = " \
 zlib-ng-compat \
 bzip2-libs \
 libpng \
 harfbuzz \
 libbrotli \
 bash \
 glibc \
"

URI_freetype-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freetype-devel-2.13.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freetype-devel = " \
 brotli-devel \
 freetype \
 zlib-ng-compat-devel \
 pkgconf \
 harfbuzz-devel \
 pkgconf-pkg-config \
 bzip2-devel \
 bash \
 libpng-devel \
"

URI_freetype-demos = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freetype-demos-2.13.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freetype-demos = " \
 glibc \
 freetype \
 libpng \
 libX11 \
"
