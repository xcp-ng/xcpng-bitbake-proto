
inherit dnf-bridge

PN = "cim-schema"
PE = "0"
PV = "2.54.1"
PR = "6.el10"
PACKAGES = "cim-schema cim-schema-docs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/cim-schema-2.54.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cim-schema = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cim-schema-2.54.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_cim-schema}"
RDEPENDS:cim-schema = ""

URI_cim-schema-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cim-schema-docs-2.54.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_cim-schema-docs}"
RDEPENDS:cim-schema-docs = ""
