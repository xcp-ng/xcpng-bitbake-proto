
inherit dnf-bridge

PN = "scap-security-guide"
PE = "0"
PV = "0.1.78"
PR = "1.el10_0.alma.1"
PACKAGES = "scap-security-guide scap-security-guide-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/scap-security-guide-0.1.78-1.el10_0.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_scap-security-guide = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/scap-security-guide-0.1.78-1.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_scap-security-guide}"
RDEPENDS:scap-security-guide = " \
 openscap-scanner \
 xml-common \
"

URI_scap-security-guide-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/scap-security-guide-doc-0.1.78-1.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_scap-security-guide-doc}"
RDEPENDS:scap-security-guide-doc = " \
 scap-security-guide \
"
