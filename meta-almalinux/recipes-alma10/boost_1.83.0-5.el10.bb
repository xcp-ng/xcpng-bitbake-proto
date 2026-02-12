
inherit dnf-bridge

PN = "boost"
PE = "0"
PV = "1.83.0"
PR = "5.el10"
PACKAGES = "boost-system boost boost-atomic boost-chrono boost-container boost-context boost-contract boost-coroutine boost-date-time boost-devel boost-fiber boost-filesystem boost-graph boost-iostreams boost-json boost-locale boost-log boost-math boost-nowide boost-numpy3 boost-program-options boost-python3 boost-random boost-regex boost-serialization boost-stacktrace boost-test boost-thread boost-timer boost-type_erasure boost-wave boost-b2 boost-build boost-doc boost-doctools boost-examples boost-graph-mpich boost-graph-openmpi boost-mpich boost-mpich-devel boost-mpich-python3 boost-openmpi boost-openmpi-devel boost-openmpi-python3 boost-static boost-mpich-python3-devel boost-openmpi-python3-devel boost-url"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/boost-1.83.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_boost-system = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/boost-system-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-system}"
RDEPENDS:boost-system = " \
 glibc \
"

URI_boost = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost}"
RDEPENDS:boost = " \
 boost-fiber \
 boost-filesystem \
 boost-graph \
 boost-iostreams \
 boost-json \
 boost-locale \
 boost-log \
 boost-math \
 boost-nowide \
 boost-program-options \
 boost-python3 \
 boost-random \
 boost-regex \
 boost-serialization \
 boost-stacktrace \
 boost-test \
 boost-thread \
 boost-timer \
 boost-type_erasure \
 boost-wave \
 boost-system \
 boost-atomic \
 boost-chrono \
 boost-container \
 boost-context \
 boost-contract \
 boost-coroutine \
 boost-date-time \
"

URI_boost-atomic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-atomic-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-atomic}"
RDEPENDS:boost-atomic = " \
 glibc \
 libstdc++ \
"

URI_boost-chrono = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-chrono-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-chrono}"
RDEPENDS:boost-chrono = " \
 glibc \
 libgcc \
 boost-system \
 libstdc++ \
"

URI_boost-container = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-container-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-container}"
RDEPENDS:boost-container = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-context = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-context-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-context}"
RDEPENDS:boost-context = " \
 glibc \
 libstdc++ \
"

URI_boost-contract = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-contract-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-contract}"
RDEPENDS:boost-contract = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-coroutine = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-coroutine-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-coroutine}"
RDEPENDS:boost-coroutine = " \
 glibc \
 libstdc++ \
 boost-context \
"

URI_boost-date-time = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-date-time-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-date-time}"
RDEPENDS:boost-date-time = " \
 glibc \
"

URI_boost-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-devel-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-devel}"
RDEPENDS:boost-devel = " \
 libquadmath-devel \
 libicu-devel \
 boost-numpy3 \
 boost \
"

URI_boost-fiber = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-fiber-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-fiber}"
RDEPENDS:boost-fiber = " \
 boost-filesystem \
 libgcc \
 libstdc++ \
 glibc \
 boost-context \
"

URI_boost-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-filesystem-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-filesystem}"
RDEPENDS:boost-filesystem = " \
 boost-atomic \
 libgcc \
 libstdc++ \
 glibc \
 boost-system \
"

URI_boost-graph = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-graph-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-graph}"
RDEPENDS:boost-graph = " \
 libgcc \
 boost-regex \
 libstdc++ \
 glibc \
 libicu \
"

URI_boost-iostreams = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-iostreams-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-iostreams}"
RDEPENDS:boost-iostreams = " \
 zlib-ng-compat \
 bzip2-libs \
 libgcc \
 libzstd \
 libstdc++ \
 glibc \
 xz-libs \
"

URI_boost-json = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-json-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-json}"
RDEPENDS:boost-json = " \
 glibc \
 boost-container \
 libgcc \
 libstdc++ \
"

URI_boost-locale = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-locale-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-locale}"
RDEPENDS:boost-locale = " \
 libgcc \
 boost-chrono \
 boost-thread \
 libstdc++ \
 glibc \
 libicu \
 boost-system \
"

URI_boost-log = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-log-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-log}"
RDEPENDS:boost-log = " \
 boost-filesystem \
 boost-atomic \
 libgcc \
 boost-chrono \
 boost-regex \
 boost-thread \
 libstdc++ \
 glibc \
 libicu \
"

URI_boost-math = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-math-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-math}"
RDEPENDS:boost-math = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-nowide = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-nowide-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-nowide}"
RDEPENDS:boost-nowide = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-numpy3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-numpy3-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-numpy3}"
RDEPENDS:boost-numpy3 = " \
 boost-python3 \
 libgcc \
 libstdc++ \
 glibc \
 python3-numpy \
"

URI_boost-program-options = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-program-options-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-program-options}"
RDEPENDS:boost-program-options = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-python3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-python3-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-python3}"
RDEPENDS:boost-python3 = " \
 glibc \
 python3 \
 libgcc \
 libstdc++ \
"

URI_boost-random = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-random-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-random}"
RDEPENDS:boost-random = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-regex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-regex-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-regex}"
RDEPENDS:boost-regex = " \
 glibc \
 libicu \
 libgcc \
 libstdc++ \
"

URI_boost-serialization = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-serialization-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-serialization}"
RDEPENDS:boost-serialization = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-stacktrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-stacktrace-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-stacktrace}"
RDEPENDS:boost-stacktrace = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-test = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-test-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-test}"
RDEPENDS:boost-test = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-thread = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-thread-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-thread}"
RDEPENDS:boost-thread = " \
 glibc \
 libgcc \
 boost-system \
 libstdc++ \
"

URI_boost-timer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-timer-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-timer}"
RDEPENDS:boost-timer = " \
 libgcc \
 libstdc++ \
 glibc \
 boost-chrono \
 boost-system \
"

URI_boost-type_erasure = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-type_erasure-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-type_erasure}"
RDEPENDS:boost-type_erasure = " \
 libgcc \
 boost-thread \
 libstdc++ \
 glibc \
 boost-chrono \
 boost-system \
"

URI_boost-wave = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boost-wave-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-wave}"
RDEPENDS:boost-wave = " \
 boost-filesystem \
 libgcc \
 boost-thread \
 libstdc++ \
 glibc \
 boost-chrono \
 boost-system \
 boost-date-time \
"

URI_boost-b2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-b2-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-b2}"
RDEPENDS:boost-b2 = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_boost-build = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-build-1.83.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_boost-build}"
RDEPENDS:boost-build = " \
 python3 \
 boost-b2 \
"

URI_boost-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-doc-1.83.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_boost-doc}"
RDEPENDS:boost-doc = ""

URI_boost-doctools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-doctools-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-doctools}"
RDEPENDS:boost-doctools = " \
 libgcc \
 docbook-dtds \
 docbook-style-xsl \
 libstdc++ \
 bash \
 glibc \
"

URI_boost-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-examples-1.83.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_boost-examples}"
RDEPENDS:boost-examples = " \
 boost-devel \
"

URI_boost-graph-mpich = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-graph-mpich-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-graph-mpich}"
RDEPENDS:boost-graph-mpich = " \
 boost-mpich \
 libgcc \
 boost-serialization \
 libstdc++ \
 glibc \
 mpich \
"

URI_boost-graph-openmpi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-graph-openmpi-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-graph-openmpi}"
RDEPENDS:boost-graph-openmpi = " \
 openmpi \
 libgcc \
 boost-openmpi \
 boost-serialization \
 libstdc++ \
 glibc \
"

URI_boost-mpich = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-mpich-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-mpich}"
RDEPENDS:boost-mpich = " \
 libgcc \
 boost-serialization \
 libstdc++ \
 glibc \
 mpich \
"

URI_boost-mpich-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-mpich-devel-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-mpich-devel}"
RDEPENDS:boost-mpich-devel = " \
 boost-graph-mpich \
 boost-mpich \
 boost-devel \
"

URI_boost-mpich-python3 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-mpich-python3-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-mpich-python3}"
RDEPENDS:boost-mpich-python3 = " \
 python3 \
 python3-mpich \
 boost-mpich \
 libgcc \
 boost-python3 \
 boost-serialization \
 libstdc++ \
 glibc \
 mpich \
"

URI_boost-openmpi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-openmpi-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-openmpi}"
RDEPENDS:boost-openmpi = " \
 openmpi \
 libgcc \
 boost-serialization \
 libstdc++ \
 glibc \
"

URI_boost-openmpi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-openmpi-devel-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-openmpi-devel}"
RDEPENDS:boost-openmpi-devel = " \
 boost-graph-openmpi \
 boost-openmpi \
 boost-devel \
"

URI_boost-openmpi-python3 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-openmpi-python3-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-openmpi-python3}"
RDEPENDS:boost-openmpi-python3 = " \
 python3 \
 openmpi \
 libgcc \
 boost-python3 \
 python3-openmpi \
 boost-openmpi \
 boost-serialization \
 libstdc++ \
 glibc \
"

URI_boost-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/boost-static-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-static}"
RDEPENDS:boost-static = " \
 boost-devel \
"

URI_boost-mpich-python3-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/boost-mpich-python3-devel-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-mpich-python3-devel}"
RDEPENDS:boost-mpich-python3-devel = " \
 boost-mpich-devel \
 boost-mpich-python3 \
 boost-devel \
"

URI_boost-openmpi-python3-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/boost-openmpi-python3-devel-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-openmpi-python3-devel}"
RDEPENDS:boost-openmpi-python3-devel = " \
 boost-openmpi-python3 \
 boost-openmpi-devel \
 boost-devel \
"

URI_boost-url = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/boost-url-1.83.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_boost-url}"
RDEPENDS:boost-url = " \
 glibc \
 libgcc \
 libstdc++ \
"
