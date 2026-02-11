
PN = "ghostscript"
PE = "0"
PV = "10.02.1"
PR = "16.el10_0"
PACKAGES = "ghostscript ghostscript-doc ghostscript-tools-fonts ghostscript-tools-printing libgs ghostscript-tools-dvipdf libgs-devel ghostscript-gtk"


URI_ghostscript = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ghostscript-10.02.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ghostscript = " \
 ghostscript-tools-printing \
 libgs \
 bash \
 jbig2dec-libs \
 glibc \
 ghostscript-tools-fonts \
"

URI_ghostscript-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ghostscript-doc-10.02.1-16.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ghostscript-doc = " \
 ghostscript \
"

URI_ghostscript-tools-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ghostscript-tools-fonts-10.02.1-16.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ghostscript-tools-fonts = " \
 bash \
 ghostscript \
"

URI_ghostscript-tools-printing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ghostscript-tools-printing-10.02.1-16.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ghostscript-tools-printing = " \
 bash \
 ghostscript \
"

URI_libgs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgs-10.02.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgs = " \
 urw-base35-fonts \
 zlib-ng-compat \
 freetype \
 libpng \
 lcms2 \
 openjpeg2 \
 adobe-mappings-cmap \
 adobe-mappings-cmap-deprecated \
 adobe-mappings-pdf \
 cups-libs \
 libpaper \
 fontconfig \
 libijs \
 google-droid-sans-fonts \
 jbig2dec-libs \
 glibc \
 libjpeg-turbo \
 libtiff \
"

URI_ghostscript-tools-dvipdf = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ghostscript-tools-dvipdf-10.02.1-16.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ghostscript-tools-dvipdf = " \
 texlive-dvips \
 bash \
 ghostscript \
"

URI_libgs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgs-devel-10.02.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgs-devel = " \
 libgs \
"

URI_ghostscript-gtk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ghostscript-gtk-10.02.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ghostscript-gtk = " \
 gdk-pixbuf2 \
 libgs \
 cairo \
 glib2 \
 gtk3 \
 glibc \
"
