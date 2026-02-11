
inherit dnf-bridge

PN = "maven-plugin-tools"
PE = "0"
PV = "3.9.0"
PR = "7.el10"
PACKAGES = "maven-plugin-annotations maven-plugin-plugin maven-plugin-tools maven-plugin-tools-annotations maven-plugin-tools-api maven-plugin-tools-generators maven-plugin-tools-java maven-plugin-tools-javadoc"


URI_maven-plugin-annotations = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-annotations-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-annotations = " \
 javapackages-filesystem \
"

URI_maven-plugin-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-plugin-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-plugin = " \
 plexus-utils \
 javapackages-filesystem \
 maven-plugin-annotations \
 maven-plugin-tools-annotations \
 maven-plugin-tools-api \
 maven-plugin-tools-generators \
 maven-plugin-tools-java \
 plexus-build-api0 \
"

URI_maven-plugin-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools = " \
 javapackages-filesystem \
 maven-parent \
"

URI_maven-plugin-tools-annotations = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-annotations-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-annotations = " \
 objectweb-asm \
 jsoup \
 plexus-utils \
 javapackages-filesystem \
 maven-plugin-annotations \
 sisu \
 maven-plugin-tools-api \
 plexus-archiver \
 qdox \
 slf4j \
 maven-lib \
"

URI_maven-plugin-tools-api = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-api-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-api = " \
 httpcomponents-client \
 httpcomponents-core \
 plexus-utils \
 javapackages-filesystem \
 slf4j \
 maven-lib \
 maven-wagon \
 plexus-languages \
"

URI_maven-plugin-tools-generators = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-generators-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-generators = " \
 objectweb-asm \
 jsoup \
 plexus-utils \
 javapackages-filesystem \
 maven-plugin-tools-api \
 maven-lib \
"

URI_maven-plugin-tools-java = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-java-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-java = " \
 plexus-utils \
 javapackages-filesystem \
 sisu \
 maven-plugin-tools-api \
 qdox \
 maven-lib \
"

URI_maven-plugin-tools-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-javadoc-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-javadoc = " \
 javapackages-filesystem \
"
