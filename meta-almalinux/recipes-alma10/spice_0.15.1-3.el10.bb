
PN = "spice"
PE = "0"
PV = "0.15.1"
PR = "3.el10"
PACKAGES = "spice-server spice-server-devel"


URI_spice-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-server-0.15.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-server = " \
 zlib-ng-compat \
 gstreamer1 \
 lz4-libs \
 libgcc \
 openssl-libs \
 gstreamer1-plugins-base \
 cyrus-sasl-lib \
 libstdc++ \
 glib2 \
 glibc \
 opus \
 libjpeg-turbo \
 pixman \
 orc \
"

URI_spice-server-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/spice-server-devel-0.15.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-server-devel = " \
 glib2-devel \
 libcacard-devel \
 pkgconf-pkg-config \
 openssl-devel \
 spice-protocol \
 spice-server \
 pixman-devel \
"
