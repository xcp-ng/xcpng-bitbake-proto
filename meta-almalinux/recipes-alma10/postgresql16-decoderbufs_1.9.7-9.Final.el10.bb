
PN = "postgresql16-decoderbufs"
PE = "0"
PV = "1.9.7"
PR = "9.Final.el10"
PACKAGES = "postgres-decoderbufs"


URI_postgres-decoderbufs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgres-decoderbufs-1.9.7-9.Final.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgres-decoderbufs = "postgresql-server ( >=  16) postgresql-server ( <  17) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libprotobuf-c.so.1()(64bit) ( ) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) ( ) protobuf-c ( )"
RPROVIDES:postgres-decoderbufs = "postgres-decoderbufs-any ( ) postgres-decoderbufs ( =  1.9.7-9.Final.el10) postgres-decoderbufs(x86-64) ( =  1.9.7-9.Final.el10) postgresql-postgres-decoderbufs ( =  1.9.7-9.Final.el10) postgresql16-decoderbufs ( =  1.9.7-9.Final.el10)"
