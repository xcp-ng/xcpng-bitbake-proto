
inherit dnf-bridge

PN = "postgresql16-decoderbufs"
PE = "0"
PV = "1.9.7"
PR = "9.Final.el10"
PACKAGES = "postgres-decoderbufs"


URI_postgres-decoderbufs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgres-decoderbufs-1.9.7-9.Final.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgres-decoderbufs = " \
 glibc \
 postgresql-server \
 protobuf-c \
"
