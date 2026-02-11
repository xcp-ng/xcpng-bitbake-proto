
PN = "adobe-mappings-pdf"
PE = "0"
PV = "20190401"
PR = "9.el10"
PACKAGES = "adobe-mappings-pdf adobe-mappings-pdf-devel"


URI_adobe-mappings-pdf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/adobe-mappings-pdf-20190401-9.el10.noarch.rpm;unpack=0"
RDEPENDS:adobe-mappings-pdf = ""
RPROVIDES:adobe-mappings-pdf = "adobe-mappings-pdf ( =  20190401-9.el10)"

URI_adobe-mappings-pdf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/adobe-mappings-pdf-devel-20190401-9.el10.noarch.rpm;unpack=0"
RDEPENDS:adobe-mappings-pdf-devel = "adobe-mappings-pdf ( =  20190401-9.el10)"
RPROVIDES:adobe-mappings-pdf-devel = "rpm_macro(adobe_mappings_rootpath) ( ) adobe-mappings-pdf-devel ( =  20190401-9.el10)"
