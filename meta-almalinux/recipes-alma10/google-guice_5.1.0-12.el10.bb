
PN = "google-guice"
PE = "0"
PV = "5.1.0"
PR = "12.el10"
PACKAGES = "google-guice google-guice-javadoc guice-assistedinject guice-bom guice-extensions guice-grapher guice-jmx guice-jndi guice-parent guice-servlet guice-throwingproviders"


URI_google-guice = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-guice-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:google-guice = "
 aopalliance
 atinject
 javapackages-filesystem
 guava
"

URI_google-guice-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/google-guice-javadoc-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:google-guice-javadoc = "
 javapackages-filesystem
"

URI_guice-assistedinject = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-assistedinject-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-assistedinject = "
 javapackages-filesystem
 google-guice
"

URI_guice-bom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-bom-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-bom = "
 javapackages-filesystem
 guice-parent
"

URI_guice-extensions = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-extensions-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-extensions = "
 javapackages-filesystem
 maven-bundle-plugin
 maven-remote-resources-plugin
 google-guice
 guice-parent
 maven-source-plugin
"

URI_guice-grapher = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-grapher-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-grapher = "
 guice-assistedinject
 javapackages-filesystem
 google-guice
"

URI_guice-jmx = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-jmx-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-jmx = "
 javapackages-filesystem
 google-guice
"

URI_guice-jndi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-jndi-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-jndi = "
 javapackages-filesystem
 google-guice
"

URI_guice-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-parent-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-parent = "
 javapackages-filesystem
"

URI_guice-servlet = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-servlet-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-servlet = "
 javapackages-filesystem
 google-guice
"

URI_guice-throwingproviders = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-throwingproviders-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-throwingproviders = "
 jsr-305
 javapackages-filesystem
 google-guice
"
