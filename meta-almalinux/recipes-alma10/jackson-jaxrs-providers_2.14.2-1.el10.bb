
PN = "jackson-jaxrs-providers"
PE = "0"
PV = "2.14.2"
PR = "1.el10"
PACKAGES = "jackson-jaxrs-json-provider jackson-jaxrs-providers jackson-jaxrs-providers-datatypes jackson-jaxrs-providers-parent"


URI_jackson-jaxrs-json-provider = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-jaxrs-json-provider-2.14.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-jaxrs-json-provider = "
 jackson-jaxrs-providers
 javapackages-filesystem
 java-21-openjdk-headless
 jackson-module-jaxb-annotations
"

URI_jackson-jaxrs-providers = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-jaxrs-providers-2.14.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-jaxrs-providers = "
 jackson-core
 jackson-databind
 javapackages-filesystem
 java-21-openjdk-headless
"

URI_jackson-jaxrs-providers-datatypes = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-jaxrs-providers-datatypes-2.14.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-jaxrs-providers-datatypes = "
 jackson-core
 jackson-databind
 javapackages-filesystem
 java-21-openjdk-headless
"

URI_jackson-jaxrs-providers-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-jaxrs-providers-parent-2.14.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-jaxrs-providers-parent = "
 jackson-bom
 javapackages-filesystem
 java-21-openjdk-headless
"
