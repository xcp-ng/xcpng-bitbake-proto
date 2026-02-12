
inherit dnf-bridge

PN = "tracker-miners"
PE = "0"
PV = "3.7.3"
PR = "4.el10"
PACKAGES = "tracker-miners"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/tracker-miners-3.7.3-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tracker-miners = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tracker-miners-3.7.3-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tracker-miners}"
RDEPENDS:tracker-miners = " \
 libpng \
 libtracker-sparql \
 poppler-glib \
 upower-libs \
 libseccomp \
 libosinfo \
 libblkid \
 exempi \
 libexif \
 libgexiv2 \
 libgcc \
 libxml2 \
 bash \
 libgsf \
 libicu \
 tracker \
 libgxps \
 giflib \
 gstreamer1 \
 gstreamer1-plugins-base \
 libiptcdata \
 glib2 \
 glibc \
 libjpeg-turbo \
 libtiff \
"
