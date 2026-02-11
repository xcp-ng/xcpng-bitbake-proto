
inherit dnf-bridge

PN = "qt6-qtmultimedia"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtmultimedia qt6-qtmultimedia-devel qt6-qtmultimedia-examples qt6-qtmultimedia-tests"


URI_qt6-qtmultimedia = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtmultimedia-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtmultimedia = " \
 alsa-lib \
 qt6-qtdeclarative \
 gstreamer1 \
 libglvnd-egl \
 pulseaudio-libs \
 gstreamer1-plugins-bad-free-libs \
 gstreamer1-plugins-base \
 qt6-qtbase \
 qt6-qtquick3d \
 libstdc++ \
 qt6-qtbase-gui \
 glib2 \
 glibc \
"

URI_qt6-qtmultimedia-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtmultimedia-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtmultimedia-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 qt6-qtmultimedia \
 qt6-qtmultimedia-devel \
 pulseaudio-libs-devel \
 pkgconf-pkg-config \
 qt6-qtbase-devel \
"

URI_qt6-qtmultimedia-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtmultimedia-examples-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtmultimedia-examples = " \
 qt6-qtdeclarative \
 qt6-qtmultimedia \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtmultimedia-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtmultimedia-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtmultimedia-tests = " \
 python3 \
 qt6-qtdeclarative \
 gstreamer1 \
 libglvnd-egl \
 pulseaudio-libs \
 qt6-qtmultimedia \
 libgcc \
 gstreamer1-plugins-bad-free-libs \
 gstreamer1-plugins-base \
 qt6-qtbase \
 libstdc++ \
 bash \
 glib2 \
 qt6-qtbase-gui \
 glibc \
"
