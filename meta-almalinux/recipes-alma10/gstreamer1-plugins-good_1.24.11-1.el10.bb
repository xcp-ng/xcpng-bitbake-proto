
PN = "gstreamer1-plugins-good"
PE = "0"
PV = "1.24.11"
PR = "1.el10"
PACKAGES = "gstreamer1-plugins-good gstreamer1-plugins-good-gtk gstreamer1-plugins-good-qt6"


URI_gstreamer1-plugins-good = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-plugins-good-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-plugins-good = "
 libpng
 libX11
 libv4l
 taglib
 libXdamage
 libXext
 libXfixes
 libstdc++
 cairo
 libXtst
 cairo-gobject
 libvpx
 zlib-ng-compat
 pulseaudio-libs
 speex
 libgcc
 openssl-libs
 libxml2
 gdk-pixbuf2
 libgudev
 flac-libs
 libshout
 orc
 wavpack
 lame-libs
 bzip2-libs
 gstreamer1
 gstreamer1-plugins-base
 twolame-libs
 glib2
 glibc
 libjpeg-turbo
 mpg123-libs
"

URI_gstreamer1-plugins-good-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-plugins-good-gtk-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-plugins-good-gtk = "
 gstreamer1
 gstreamer1-plugins-base
 gstreamer1-plugins-good
 cairo
 glib2
 gtk3
 glibc
"

URI_gstreamer1-plugins-good-qt6 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gstreamer1-plugins-good-qt6-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-plugins-good-qt6 = "
 qt6-qtdeclarative
 gstreamer1
 libglvnd-gles
 libgcc
 gstreamer1-plugins-base
 qt6-qtbase
 qt6-qtwayland
 gstreamer1-plugins-good
 libstdc++
 qt6-qtbase-gui
 glib2
 glibc
"
