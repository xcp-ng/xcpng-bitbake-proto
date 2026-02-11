
PN = "qt6-qtspeech"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtspeech qt6-qtspeech-devel qt6-qtspeech-speechd qt6-qtspeech-examples qt6-qtspeech-tests"


URI_qt6-qtspeech = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtspeech-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtspeech = " \
 qt6-qtdeclarative \
 qt6-qtmultimedia \
 qt6-qtbase \
 libstdc++ \
 glibc \
"

URI_qt6-qtspeech-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtspeech-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtspeech-devel = " \
 qt6-qtspeech \
 cmake-filesystem \
 qt6-qtmultimedia-devel \
 pkgconf-pkg-config \
 qt6-qtbase-devel \
"

URI_qt6-qtspeech-speechd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtspeech-speechd-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtspeech-speechd = " \
 qt6-qtspeech \
 cmake-filesystem \
 speech-dispatcher-libs \
 qt6-qtbase \
 libstdc++ \
 glibc \
"

URI_qt6-qtspeech-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtspeech-examples-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtspeech-examples = " \
 qt6-qtspeech \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtspeech-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtspeech-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtspeech-tests = " \
 qt6-qtspeech \
 qt6-qtdeclarative \
 qt6-qtmultimedia \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"
