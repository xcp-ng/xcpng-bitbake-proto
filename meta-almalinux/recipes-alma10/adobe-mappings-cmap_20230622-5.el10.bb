
PN = "adobe-mappings-cmap"
PE = "0"
PV = "20230622"
PR = "5.el10"
PACKAGES = "adobe-mappings-cmap adobe-mappings-cmap-deprecated adobe-mappings-cmap-devel"


URI_adobe-mappings-cmap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/adobe-mappings-cmap-20230622-5.el10.noarch.rpm;unpack=0"
RDEPENDS:adobe-mappings-cmap = ""
RPROVIDES:adobe-mappings-cmap = "adobe-mappings-cmap ( =  20230622-5.el10) cmap-resources ( =  2023.06.22-6.5.el10) cmap-resources-cns1-6 ( =  2023.06.22-6.5.el10) cmap-resources-cns1-7 ( =  2023.06.22-6.5.el10) cmap-resources-gb1-5 ( =  2023.06.22-6.5.el10) cmap-resources-identity-0 ( =  2023.06.22-6.5.el10) cmap-resources-japan1-7 ( =  2023.06.22-6.5.el10) cmap-resources-korea1-2 ( =  2023.06.22-6.5.el10) cmap-resources-kr-9 ( =  2023.06.22-6.5.el10)"

URI_adobe-mappings-cmap-deprecated = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/adobe-mappings-cmap-deprecated-20230622-5.el10.noarch.rpm;unpack=0"
RDEPENDS:adobe-mappings-cmap-deprecated = "adobe-mappings-cmap ( =  20230622-5.el10)"
RPROVIDES:adobe-mappings-cmap-deprecated = "adobe-mappings-cmap-deprecated ( =  20230622-5.el10) cmap-resources-japan2-0 ( =  2023.06.22-6.5.el10)"

URI_adobe-mappings-cmap-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/adobe-mappings-cmap-devel-20230622-5.el10.noarch.rpm;unpack=0"
RDEPENDS:adobe-mappings-cmap-devel = "adobe-mappings-cmap ( =  20230622-5.el10) adobe-mappings-cmap-deprecated ( =  20230622-5.el10)"
RPROVIDES:adobe-mappings-cmap-devel = "rpm_macro(adobe_mappings_rootpath) ( ) adobe-mappings-cmap-devel ( =  20230622-5.el10)"
