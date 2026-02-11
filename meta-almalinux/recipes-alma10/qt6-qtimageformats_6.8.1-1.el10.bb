
PN = "qt6-qtimageformats"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtimageformats qt6-qtimageformats-tests"


URI_qt6-qtimageformats = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtimageformats-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtimageformats = "
 cmake-filesystem
 jasper-libs
 libwebp
 qt6-qtbase
 libmng
 libstdc++
 qt6-qtbase-gui
 glibc
 libtiff
"

URI_qt6-qtimageformats-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtimageformats-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtimageformats-tests = "
 qt6-qtimageformats
 libgcc
 qt6-qtbase
 libstdc++
 qt6-qtbase-gui
 glibc
"
