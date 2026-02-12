
inherit dnf-bridge

PN = "package-notes"
PE = "0"
PV = "0.5"
PR = "13.el10"
PACKAGES = "package-notes-srpm-macros"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/package-notes-0.5-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_package-notes-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/package-notes-srpm-macros-0.5-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_package-notes-srpm-macros}"
RDEPENDS:package-notes-srpm-macros = ""
