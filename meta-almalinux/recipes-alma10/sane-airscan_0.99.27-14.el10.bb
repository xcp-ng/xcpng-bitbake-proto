
PN = "sane-airscan"
PE = "0"
PV = "0.99.27"
PR = "14.el10"
PACKAGES = "libsane-airscan sane-airscan"


URI_libsane-airscan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsane-airscan-0.99.27-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsane-airscan = " \
 gnutls \
 libpng \
 libxml2 \
 avahi-libs \
 glibc \
 libjpeg-turbo \
"

URI_sane-airscan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-airscan-0.99.27-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-airscan = " \
 gnutls \
 libsane-airscan \
 libxml2 \
 avahi-libs \
 glibc \
"
