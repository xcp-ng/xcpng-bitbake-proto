
inherit dnf-bridge

PN = "docbook-dtds"
PE = "0"
PV = "1.0"
PR = "90.el10_0"
PACKAGES = "docbook-dtds"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/docbook-dtds-1.0-90.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_docbook-dtds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/docbook-dtds-1.0-90.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_docbook-dtds}"
RDEPENDS:docbook-dtds = " \
 sgml-common \
 libxml2 \
 bash \
 xml-common \
 sed \
 coreutils \
"
