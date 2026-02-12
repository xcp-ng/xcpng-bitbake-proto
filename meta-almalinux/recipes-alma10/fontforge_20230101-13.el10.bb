
inherit dnf-bridge

PN = "fontforge"
PE = "0"
PV = "20230101"
PR = "13.el10"
PACKAGES = "fontforge fontforge-devel fontforge-doc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/fontforge-20230101-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fontforge = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fontforge-20230101-13.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fontforge}"
RDEPENDS:fontforge = " \
 python3 \
 libpng \
 xdg-utils \
 pango \
 hicolor-icon-theme \
 python3-libs \
 libstdc++ \
 cairo \
 potrace \
 zlib-ng-compat \
 libgcc \
 libxml2 \
 giflib \
 freetype \
 libspiro \
 readline \
 woff2 \
 glib2 \
 gtk3 \
 glibc \
 libjpeg-turbo \
 libtiff \
"

URI_fontforge-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fontforge-devel-20230101-13.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fontforge-devel}"
RDEPENDS:fontforge-devel = " \
 fontforge-doc \
 fontforge \
"

URI_fontforge-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fontforge-doc-20230101-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_fontforge-doc}"
RDEPENDS:fontforge-doc = ""
