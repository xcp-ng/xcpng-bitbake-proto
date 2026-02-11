
inherit dnf-bridge

PN = "tesseract"
PE = "0"
PV = "5.3.4"
PR = "6.el10"
PACKAGES = "tesseract tesseract-devel tesseract-tools"


URI_tesseract = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tesseract-5.3.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tesseract = " \
 tesseract-langpack-eng \
 leptonica \
 libgcc \
 libstdc++ \
 libcurl \
 glibc \
"

URI_tesseract-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tesseract-devel-5.3.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tesseract-devel = " \
 leptonica-devel \
 tesseract \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_tesseract-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tesseract-tools-5.3.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tesseract-tools = " \
 tesseract \
 leptonica \
 libgcc \
 harfbuzz \
 pango \
 fontconfig \
 libstdc++ \
 glib2 \
 cairo \
 glibc \
 libicu \
"
