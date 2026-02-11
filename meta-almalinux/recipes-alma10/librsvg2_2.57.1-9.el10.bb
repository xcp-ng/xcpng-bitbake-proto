
inherit dnf-bridge

PN = "librsvg2"
PE = "0"
PV = "2.57.1"
PR = "9.el10"
PACKAGES = "librsvg2 librsvg2-devel librsvg2-tools rsvg-pixbuf-loader"


URI_librsvg2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librsvg2-2.57.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librsvg2 = " \
 freetype \
 libpng \
 libgcc \
 harfbuzz \
 libxml2 \
 pango \
 gdk-pixbuf2 \
 fontconfig \
 cairo \
 glib2 \
 cairo-gobject \
 glibc \
 rsvg-pixbuf-loader \
"

URI_librsvg2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librsvg2-devel-2.57.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librsvg2-devel = " \
 glib2-devel \
 librsvg2 \
 pkgconf-pkg-config \
 gdk-pixbuf2-devel \
 cairo-devel \
"

URI_librsvg2-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librsvg2-tools-2.57.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librsvg2-tools = " \
 librsvg2 \
 libgcc \
 libxml2 \
 pango \
 gdk-pixbuf2 \
 fontconfig \
 cairo \
 glib2 \
 cairo-gobject \
 glibc \
"

URI_rsvg-pixbuf-loader = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsvg-pixbuf-loader-2.57.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsvg-pixbuf-loader = " \
 freetype \
 libpng \
 librsvg2 \
 harfbuzz \
 libxml2 \
 pango \
 gdk-pixbuf2 \
 fontconfig \
 cairo \
 glib2 \
 cairo-gobject \
 glibc \
"
