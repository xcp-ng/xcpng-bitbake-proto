
PN = "tzdata"
PE = "0"
PV = "2025b"
PR = "1.el10"
PACKAGES = "tzdata tzdata-java"


URI_tzdata = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tzdata-2025b-1.el10.noarch.rpm;unpack=0"
RDEPENDS:tzdata = ""
RPROVIDES:tzdata = "tzdata ( =  2025b-1.el10)"

URI_tzdata-java = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tzdata-java-2025b-1.el10.noarch.rpm;unpack=0"
RDEPENDS:tzdata-java = ""
RPROVIDES:tzdata-java = "tzdata-java ( =  2025b-1.el10)"
