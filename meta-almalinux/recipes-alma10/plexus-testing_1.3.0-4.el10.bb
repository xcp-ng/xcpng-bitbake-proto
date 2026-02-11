
PN = "plexus-testing"
PE = "0"
PV = "1.3.0"
PR = "4.el10"
PACKAGES = "plexus-testing plexus-testing-javadoc"


URI_plexus-testing = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-testing-1.3.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-testing = "
 junit5
 google-guice
 javapackages-filesystem
 sisu
"

URI_plexus-testing-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-testing-javadoc-1.3.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-testing-javadoc = "
 javapackages-filesystem
"
