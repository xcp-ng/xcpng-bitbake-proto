
PN = "python-pyqt6"
PE = "0"
PV = "6.8.0"
PR = "1.el10"
PACKAGES = "python-pyqt6-rpm-macros python3-pyqt6 python3-pyqt6-base python3-pyqt6-devel python-pyqt6-doc"


URI_python-pyqt6-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python-pyqt6-rpm-macros-6.8.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python-pyqt6-rpm-macros = ""

URI_python3-pyqt6 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyqt6-6.8.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pyqt6 = "
 python3
 qt6-qtdeclarative
 qt6-qtmultimedia
 qt6-qtpositioning
 qt6-qtquick3d
 qt6-qtremoteobjects
 qt6-qtsensors
 qt6-qtserialport
 qt6-qtspeech
 qt6-qtsvg
 qt6-qttools-libs-designer
 qt6-qttools-libs-help
 qt6-qtwebchannel
 libstdc++
 qt6-qtwebsockets
 qt6-qtbase
 python3-pyqt6-base
 qt6-qtbase-gui
 glibc
 qt6-qtconnectivity
"

URI_python3-pyqt6-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyqt6-base-6.8.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pyqt6-base = "
 python3
 qt6-qtdeclarative
 libgcc
 python3-dbus
 python3-libs
 qt6-qtbase
 python-pyqt6-rpm-macros
 python3-pyqt6-sip
 libstdc++
 bash
 qt6-qtbase-gui
 glibc
 dbus-libs
"

URI_python3-pyqt6-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyqt6-devel-6.8.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pyqt6-devel = "
 qt6-qtbase-devel
 python3-pyqt6
"

URI_python-pyqt6-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python-pyqt6-doc-6.8.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python-pyqt6-doc = ""
