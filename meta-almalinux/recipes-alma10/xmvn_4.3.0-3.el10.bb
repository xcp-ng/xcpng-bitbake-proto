
PN = "xmvn"
PE = "0"
PV = "4.3.0"
PR = "3.el10"
PACKAGES = "xmvn xmvn-core xmvn-javadoc xmvn-minimal xmvn-mojo xmvn-toolchain-openjdk21 xmvn-tools"


URI_xmvn = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn = "
 xmvn-minimal
 maven
"

URI_xmvn-core = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-core-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-core = "
 javapackages-filesystem
"

URI_xmvn-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-javadoc-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-javadoc = ""

URI_xmvn-minimal = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-minimal-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-minimal = "
 apache-commons-cli
 apache-commons-compress
 google-guice
 objectweb-asm
 xmvn-tools
 javapackages-filesystem
 maven-unbound
 sisu
 slf4j
 beust-jcommander
 maven-lib
 maven-resolver
 maven-wagon
 atinject
 bash
 plexus-cipher
 plexus-classworlds
 plexus-containers-component-annotations
 plexus-interpolation
 plexus-sec-dispatcher
 plexus-utils
 xmvn-core
 guava
"

URI_xmvn-mojo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-mojo-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-mojo = "
 objectweb-asm
 maven-resolver
 javapackages-filesystem
 xmvn-core
"

URI_xmvn-toolchain-openjdk21 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-toolchain-openjdk21-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-toolchain-openjdk21 = "
 java-21-openjdk-devel
 xmvn-minimal
 javapackages-tools
"

URI_xmvn-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-tools-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-tools = "
 objectweb-asm
 apache-commons-compress
 javapackages-filesystem
 bash
 slf4j
 beust-jcommander
 xmvn-core
"
