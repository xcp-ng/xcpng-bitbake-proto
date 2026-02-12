
inherit dnf-bridge

PN = "qt6-qttranslations"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qttranslations"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qt6-qttranslations-6.8.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qt6-qttranslations = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qttranslations-6.8.1-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_qt6-qttranslations}"
RDEPENDS:qt6-qttranslations = ""
