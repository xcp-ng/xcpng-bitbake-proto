
inherit dnf-bridge

PN = "cairo"
PE = "0"
PV = "1.18.2"
PR = "2.el10"
PACKAGES = "cairo cairo-devel cairo-gobject cairo-gobject-devel cairo-tools"


URI_cairo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairo-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo = " \
 zlib-ng-compat \
 freetype \
 libpng \
 fontconfig \
 libX11 \
 libxcb \
 libXrender \
 glibc \
 pixman \
 libXext \
"

URI_cairo-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairo-devel-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo-devel = " \
 libXext-devel \
 zlib-ng-compat-devel \
 freetype-devel \
 pkgconf-pkg-config \
 fontconfig-devel \
 libXrender-devel \
 libX11-devel \
 libxcb-devel \
 cairo \
 cairo-devel \
 libpng-devel \
 pixman-devel \
"

URI_cairo-gobject = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairo-gobject-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo-gobject = " \
 glibc \
 cairo \
 glib2 \
"

URI_cairo-gobject-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairo-gobject-devel-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo-gobject-devel = " \
 libXext-devel \
 glib2-devel \
 zlib-ng-compat-devel \
 freetype-devel \
 pkgconf-pkg-config \
 fontconfig-devel \
 libpng-devel \
 libX11-devel \
 libxcb-devel \
 libXrender-devel \
 cairo-devel \
 cairo-gobject \
 pixman-devel \
"

URI_cairo-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cairo-tools-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo-tools = " \
 glibc \
 zlib-ng-compat \
 bash \
 cairo \
"
