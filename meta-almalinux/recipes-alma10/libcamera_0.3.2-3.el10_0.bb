
inherit dnf-bridge

PN = "libcamera"
PE = "0"
PV = "0.3.2"
PR = "3.el10_0"
PACKAGES = "libcamera libcamera-devel libcamera-doc libcamera-gstreamer libcamera-ipa libcamera-qcam libcamera-tools libcamera-v4l2 python3-libcamera"


URI_libcamera = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcamera-0.3.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcamera = " \
 gnutls \
 systemd-libs \
 libgcc \
 libyaml \
 libstdc++ \
 glibc \
"

URI_libcamera-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcamera-devel-0.3.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcamera-devel = " \
 pkgconf-pkg-config \
 libcamera \
 libcamera-devel \
"

URI_libcamera-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcamera-doc-0.3.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcamera-doc = ""

URI_libcamera-gstreamer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcamera-gstreamer-0.3.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcamera-gstreamer = " \
 libcamera \
 gstreamer1 \
 libgcc \
 gstreamer1-plugins-base \
 libstdc++ \
 glib2 \
 glibc \
"

URI_libcamera-ipa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcamera-ipa-0.3.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcamera-ipa = " \
 glibc \
 libgcc \
 libstdc++ \
 libcamera \
"

URI_libcamera-qcam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcamera-qcam-0.3.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcamera-qcam = " \
 libcamera \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 libtiff \
"

URI_libcamera-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcamera-tools-0.3.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcamera-tools = " \
 libevent \
 libcamera \
 libgcc \
 libyaml \
 libstdc++ \
 SDL2 \
 glibc \
 libjpeg-turbo \
 libdrm \
 libtiff \
"

URI_libcamera-v4l2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcamera-v4l2-0.3.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcamera-v4l2 = " \
 libcamera \
 libgcc \
 libstdc++ \
 bash \
 glibc \
"

URI_python3-libcamera = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-libcamera-0.3.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libcamera = " \
 python3 \
 libcamera \
 libgcc \
 libstdc++ \
 glibc \
"
