
PN = "adobe-mappings-cmap"
PE = "0"
PV = "20230622"
PR = "5.el10"
PACKAGES = "adobe-mappings-cmap adobe-mappings-cmap-deprecated adobe-mappings-cmap-devel"


URI_adobe-mappings-cmap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/adobe-mappings-cmap-20230622-5.el10.noarch.rpm;unpack=0"
RDEPENDS:adobe-mappings-cmap = ""

URI_adobe-mappings-cmap-deprecated = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/adobe-mappings-cmap-deprecated-20230622-5.el10.noarch.rpm;unpack=0"
RDEPENDS:adobe-mappings-cmap-deprecated = " \
 adobe-mappings-cmap \
"

URI_adobe-mappings-cmap-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/adobe-mappings-cmap-devel-20230622-5.el10.noarch.rpm;unpack=0"
RDEPENDS:adobe-mappings-cmap-devel = " \
 adobe-mappings-cmap \
 adobe-mappings-cmap-deprecated \
"
