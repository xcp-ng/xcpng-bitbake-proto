
PN = "python-psycopg2"
PE = "0"
PV = "2.9.9"
PR = "6.el10"
PACKAGES = "python3-psycopg2 python-psycopg2-doc python3-psycopg2-debug python3-psycopg2-tests"


URI_python3-psycopg2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-psycopg2-2.9.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psycopg2 = "
 glibc
 python3
 libpq
"

URI_python-psycopg2-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-psycopg2-doc-2.9.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python-psycopg2-doc = ""

URI_python3-psycopg2-debug = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-psycopg2-debug-2.9.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psycopg2-debug = "
 glibc
 python3-psycopg2
 python3
 libpq
"

URI_python3-psycopg2-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-psycopg2-tests-2.9.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psycopg2-tests = "
 python3
 python3-psycopg2
"
