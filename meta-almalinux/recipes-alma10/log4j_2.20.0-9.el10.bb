
inherit dnf-bridge

PN = "log4j"
PE = "0"
PV = "2.20.0"
PR = "9.el10"
PACKAGES = "log4j log4j-jcl log4j-slf4j log4j-bom log4j-javadoc log4j-web"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/log4j-2.20.0-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_log4j = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/log4j-2.20.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_log4j}"
RDEPENDS:log4j = " \
 javapackages-filesystem \
"

URI_log4j-jcl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/log4j-jcl-2.20.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_log4j-jcl}"
RDEPENDS:log4j-jcl = " \
 log4j \
 javapackages-filesystem \
 apache-commons-logging \
"

URI_log4j-slf4j = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/log4j-slf4j-2.20.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_log4j-slf4j}"
RDEPENDS:log4j-slf4j = " \
 log4j \
 javapackages-filesystem \
 slf4j \
"

URI_log4j-bom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/log4j-bom-2.20.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_log4j-bom}"
RDEPENDS:log4j-bom = " \
 javapackages-filesystem \
"

URI_log4j-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/log4j-javadoc-2.20.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_log4j-javadoc}"
RDEPENDS:log4j-javadoc = " \
 javapackages-filesystem \
"

URI_log4j-web = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/log4j-web-2.20.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_log4j-web}"
RDEPENDS:log4j-web = " \
 log4j \
 javapackages-filesystem \
"
