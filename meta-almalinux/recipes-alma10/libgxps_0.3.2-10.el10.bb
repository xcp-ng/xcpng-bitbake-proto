
inherit dnf-bridge

PN = "libgxps"
PE = "0"
PV = "0.3.2"
PR = "10.el10"
PACKAGES = "libgxps libgxps-devel libgxps-tools"


URI_libgxps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgxps-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgxps = " \
 freetype \
 lcms2 \
 libpng \
 libarchive \
 cairo \
 glib2 \
 glibc \
 libjpeg-turbo \
 libtiff \
"

URI_libgxps-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgxps-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgxps-devel = " \
 libgxps \
 libarchive-devel \
 glib2-devel \
 pkgconf-pkg-config \
 cairo-devel \
"

URI_libgxps-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgxps-tools-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgxps-tools = " \
 libgxps \
 libpng \
 cairo \
 glib2 \
 glibc \
 libjpeg-turbo \
"
