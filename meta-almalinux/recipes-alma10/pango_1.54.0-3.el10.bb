
inherit dnf-bridge

PN = "pango"
PE = "0"
PV = "1.54.0"
PR = "3.el10"
PACKAGES = "pango pango-devel pango-doc"


URI_pango = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pango-1.54.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pango = " \
 freetype \
 libXft \
 harfbuzz \
 fribidi \
 fontconfig \
 libX11 \
 libXrender \
 cairo \
 glib2 \
 glibc \
 libthai \
"

URI_pango-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pango-devel-1.54.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pango-devel = " \
 glib2-devel \
 libXft-devel \
 freetype-devel \
 fribidi-devel \
 pkgconf-pkg-config \
 pango \
 pango-devel \
 fontconfig-devel \
 libXrender-devel \
 cairo-devel \
 harfbuzz-devel \
 libthai-devel \
"

URI_pango-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pango-doc-1.54.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pango-doc = " \
 pango \
"
