
PN = "scap-security-guide"
PE = "0"
PV = "0.1.78"
PR = "1.el10_0.alma.1"
PACKAGES = "scap-security-guide scap-security-guide-doc"


URI_scap-security-guide = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/scap-security-guide-0.1.78-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:scap-security-guide = "xml-common ( ) openscap-scanner ( >=  1.2.5)"
RPROVIDES:scap-security-guide = "scap-security-guide ( =  0.1.78-1.el10_0.alma.1)"

URI_scap-security-guide-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/scap-security-guide-doc-0.1.78-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:scap-security-guide-doc = "scap-security-guide ( =  0.1.78-1.el10_0.alma.1)"
RPROVIDES:scap-security-guide-doc = "scap-security-guide-doc ( =  0.1.78-1.el10_0.alma.1)"
