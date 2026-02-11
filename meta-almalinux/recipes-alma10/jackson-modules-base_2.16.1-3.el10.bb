
inherit dnf-bridge

PN = "jackson-modules-base"
PE = "0"
PV = "2.16.1"
PR = "3.el10"
PACKAGES = "jackson-module-jaxb-annotations jackson-modules-base"


URI_jackson-module-jaxb-annotations = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-module-jaxb-annotations-2.16.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-module-jaxb-annotations = " \
 jakarta-activation \
 javapackages-filesystem \
 jackson-annotations \
 jaxb-api \
 jackson-core \
 jackson-databind \
 java-21-openjdk-headless \
"

URI_jackson-modules-base = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-modules-base-2.16.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-modules-base = " \
 jackson-bom \
 javapackages-filesystem \
 java-21-openjdk-headless \
"
