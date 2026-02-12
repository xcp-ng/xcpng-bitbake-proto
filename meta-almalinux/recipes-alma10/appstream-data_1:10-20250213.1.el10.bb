
inherit dnf-bridge

PN = "appstream-data"
PE = "1"
PV = "10"
PR = "20250213.1.el10"
PACKAGES = "appstream-data"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/appstream-data-10-20250213.1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_appstream-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/appstream-data-10-20250213.1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_appstream-data}"
RDEPENDS:appstream-data = ""
